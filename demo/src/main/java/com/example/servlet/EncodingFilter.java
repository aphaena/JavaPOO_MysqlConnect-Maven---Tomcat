package com.example.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter("/*")
public class EncodingFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {
        // Initialisation si nécessaire
    }

    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;

        // Définir l'encodage de la requête
        request.setCharacterEncoding("UTF-8");

        // Vérifier le type de contenu de la réponse et définir l'encodage en conséquence
        String contentType = response.getContentType();
        if (contentType != null && contentType.contains("application/json")) {
            response.setContentType("application/json; charset=UTF-8");
        } else {
            response.setContentType("text/html; charset=UTF-8");
        }

        // Passez au prochain élément dans la chaîne de filtres
        chain.doFilter(request, response);
    }

    public void destroy() {
        // Nettoyage si nécessaire
    }
}