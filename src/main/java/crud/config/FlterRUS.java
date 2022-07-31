package crud.config;

import org.springframework.web.filter.CharacterEncodingFilter;

import java.nio.charset.CharacterCodingException;

public class FlterRUS {
    CharacterEncodingFilter filter;
    {
        filter = new CharacterEncodingFilter();
        filter.setEncoding("UTF-8");
        filter.setForceEncoding(true);
    }
}
