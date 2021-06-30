# framework-demo-swagger
## swagger ui 설정방법

1. pom.xml에 디펜던시를 추가한다.

```
<dependency>
  <groupId>io.springfox</groupId>
  <artifactId>springfox-boot-starter</artifactId>
  <version>3.0.0</version>
</dependency>
```

2. 설정을 추가한다.
```
@EnableSwagger2
@Configuration
public class SwaggerConfig {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
			.select()
			.apis(RequestHandlerSelectors.any())
			.paths(PathSelectors.any())
			.build();
	}
}
```
3. 서버에 접속하여 swagger-ui 화면을 확인한다.
```
http://localhost:8080/swagger-ui/
```

4. 어노테이션을 사용하여 추가적인 설명을 작성한다.
어노테이션 사용법은 [메뉴얼](https://springfox.github.io/springfox/docs/current/) 참조.

