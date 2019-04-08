package section05.ex02_consumer_interface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {

	public static void main(String[] args) {
		Consumer<String> consumer = t -> System.out.println(t + "8"); 
		consumer.accept("java");
		
		BiConsumer<String, String> biconsumer = (t, u) -> System.out.println(t + u);
		biconsumer.accept("java", "8");
		
		DoubleConsumer doubleconsumer = d -> System.out.println("java" + d);
		doubleconsumer.accept(8.0);
		
		ObjIntConsumer<String> objIntConsumer = (t, i) -> System.out.println(t + i);
		objIntConsumer.accept("java", 8);

	}

}
