


import com.teste.testeEkan.secutity.JWTTokenRequest;
import com.teste.testeEkan.secutity.JWTTokenResponse;
import com.teste.testeEkan.secutity.JWTTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    private JWTTokenService tokenService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping("/authenticate")
    public ResponseEntity<JWTTokenResponse> generateToken(@RequestBody JWTTokenRequest tokenRequest) {

        var authenticationToken = new UsernamePasswordAuthenticationToken(
                tokenRequest.username(),
                tokenRequest.password()
        );

        var auth = authenticationManager.authenticate(authenticationToken);
        var token = tokenService.gerarToken(auth);
        return ResponseEntity.ok(new JWTTokenResponse(token));
    }
}
