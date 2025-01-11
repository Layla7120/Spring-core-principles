package hello.core;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import static org.springframework.context.annotation.ComponentScan.*;


@Configuration
@ComponentScan(
        excludeFilters = @Filter(
                type = FilterType.ANNOTATION,
                classes = Configuration.class
        )
    )

// Component 인 것들을 스캔해서 자동으로 등록해줌
public class AutoAppConfig {

}