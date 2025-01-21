package base;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Base64;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
/**
 * Basic handler that defines the constructor needed to register this handler. Can be extended for
 * easy implementation of handlers.
 */
public abstract class AbstractTaskHandler implements TaskHandler {

  public AbstractTaskHandler(final TaskService taskService) {
    taskService.register(this);
  }
  public static <T> String serializeObject(T object) {
	  Gson gson = new GsonBuilder().create();
	  return gson.toJson(object);
  }
  public static <T> T deserialize(String json, Class<T> a) {
      Gson gson = new GsonBuilder().create(); // Erstelle eine Gson-Instanz
      return gson.fromJson(json, a); // Konvertiere den JSON-String zurück in ein Objekt
  }
}
