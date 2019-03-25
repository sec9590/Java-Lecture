package section02;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
		
	}
	
	public static void changeDog(Animal animal) {
		if(animal instanceof Dog) {
			Dog dog = (Dog) animal; //예외발생 ->cat이 매개변수로 들어갔기에 변환이 안됨 그래서 확인하는 instanceof필요
		} else if (animal instanceof Cat) {
			Cat cat = (Cat) animal;
		}
	}
}

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
