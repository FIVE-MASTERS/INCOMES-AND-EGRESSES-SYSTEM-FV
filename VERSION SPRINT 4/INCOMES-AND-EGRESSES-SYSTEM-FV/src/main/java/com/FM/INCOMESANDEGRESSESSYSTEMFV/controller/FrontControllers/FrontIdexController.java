package com.FM.INCOMESANDEGRESSESSYSTEMFV.controller.FrontControllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontIdexController {
        @GetMapping("/index")
        public String index (Model model, @AuthenticationPrincipal OidcUser principal) {
            return "index";
        }

    }

