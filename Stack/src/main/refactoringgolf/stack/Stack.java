package refactoringgolf.stack;

public class Stack {

	private final int INITIAL_CAPACITY = 5;
	private Object[] elements = new Object[INITIAL_CAPACITY];
	private int count;

	public boolean isEmpty() {
		return count == 0;
	}

	public int getSize() {
		return count;
	}

	public void pushElement(Object element) {
		if (count + 1 > elements.length)
			duplicateSize();
		elements[count] = element;
		count++;
	}


	private void duplicateSize() {
		Object[] temp = new Object[2 * elements.length];
		System.arraycopy(elements, 0, temp, 0, elements.length);
		elements = temp;
	}

	public Object popLastElement() {
		if (isEmpty())
			throw new IllegalStateException();
		Object element = elements[count - 1];
		count--;
		return element;
	}
	

	public Object peekElement() {
		return elements[count - 1];
	}

	public boolean isElementInStack(Object elementToFind) {
		for (int i = 0; i < count; i++) {
			if (isEqual(elementToFind, i))
				return true;
		}
		return false;
	}
	
	

	public int searchElement(Object elementToFind) {
		for (int i = 1; i <= count; i++) {
			if (isEqual(elementToFind,(count-i))) {
				return i;
			}
		}
		return -1;
	}
	
	public void replaceAll(Object elementToFind, Object newElement) {
		for (int i = count - 1; i >= 0; i--) {
			if (isEqual(elementToFind, i)) 
				elements[i] = newElement;
		}
	}
	
	private boolean isEqual(Object elementToFind, int i) {
		return elementToFind == elements[i];
	}
}
