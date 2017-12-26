package org.happyman.springboot.demo.rest.resources;

import org.springframework.context.annotation.ComponentScan;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by Administrator on 2017/12/25.
 */
@ComponentScan
@Path("/rest/home")
public class HomeResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/hello")
    public Response hello() {
        Response response = new Response();
        response.setCode("200");
        response.setMessage("success");
        response.setData("hello-home-service");
        return response;

    }

    public static class Response {
        private String code;
        private String message;
        private String data;

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
}
