package experiment.belajar_spring_dasar;

import experiment.belajar_spring_dasar.client.PaymentGatewayClient;
import experiment.belajar_spring_dasar.factory.PaymentGatewayClientFactoryBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        PaymentGatewayClientFactoryBean.class
})
public class FactoryConfiguration {
}
