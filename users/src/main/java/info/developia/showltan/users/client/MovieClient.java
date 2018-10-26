package info.developia.showltan.users.client;

import info.developia.showltan.users.dto.MovieDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "movies", url = "${showltan.services.movies}")
public interface MovieClient {

    @GetMapping("/all")
    List<MovieDto> findAll();

}
