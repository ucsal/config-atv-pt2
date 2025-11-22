package ucsal.br.client.server.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/account")
@RefreshScope
public class AccountController {

    @Value("${msg:Default Message}")
    private String message;

    @Value("${taxa:0.0}")
    private Double taxa;

    @Value("${database_password:null}")
    private String dbPassword;

    @GetMapping("/info")
    public Map<String, Object> getInfo() {
        Map<String, Object> dados = new HashMap<>();
        dados.put("mensagem", message);
        dados.put("taxa_juros", taxa);
        dados.put("senha_secreta", dbPassword);
        return dados;
    }
}