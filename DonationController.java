import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
@RequestMapping("/api/doacoes")
@CrossOrigin(origins = "*") // Permite que seu site no Vercel acesse o Java
public class DonationController {

    @Autowired
    private DonationRepository repository; // Isso conecta com o Banco de Dados

    // Esse método recebe a doação do site e salva no banco
    @PostMapping
    public void receberDoacao(@RequestBody Doacao doacao) {
        repository.save(doacao); // Salva as informações
        System.out.println("Doação recebida de: " + doacao.getNome());
    }
}
