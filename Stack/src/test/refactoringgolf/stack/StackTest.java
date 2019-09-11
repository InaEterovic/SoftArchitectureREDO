package refactoringgolf.stack;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class StackTest {
    private Stack stack;

    @Before
    public void setup()
    {
        stack = new Stack();
    }

    @Test
    public void emptyWhenCreated()
    {
        assertTrue(stack.isEmpty());
    }

    @Test
    public void returnTheNumberOfItems()
    {
        stack.pushElement("1");
        stack.pushElement("2");
        assertEquals(2, stack.getSize());
    }

    @Test
    public void emptyWhenPushAndPopOneItem()
    {
        stack.pushElement("1");
        stack.popLastElement();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void notEmptyWhenPush()
    {
        stack.pushElement("1");
        assertFalse(stack.isEmpty());
    }

    @Test
    public void pushAndPopOneItem()
    {
        stack.pushElement("1");
        assertEquals("1", stack.popLastElement());
    }

    @Test
    public void popTheLastWhenTwoItems()
    {
        stack.pushElement("1");
        stack.pushElement("2");
        assertEquals("2", stack.popLastElement());
    }

    @Test
    public void pushAndPopTwoItems()
    {
        stack.pushElement("1");
        stack.pushElement("2");
        stack.popLastElement();
        assertEquals("1", stack.popLastElement());
    }

    @Test
    public void returnOneItemWithoutRemovingIt()
    {
        stack.pushElement("1");
        stack.peekElement();
        assertEquals("1", stack.peekElement());

    }

    @Test
    public void returnThePositionWhereAnItemExits() {
        stack.pushElement("1");
        stack.pushElement("2");
        stack.pushElement("3");
        stack.pushElement("4");
        assertEquals(3, stack.searchElement("2"));
    }

    @Test
    public void returnMinusOneWhenItemDoesntExits()
    {
        assertEquals(-1, stack.searchElement("1"));
    }

    @Test
    public void containAndItemAlreadyPushed()
    {
        stack.pushElement("1");
        assertTrue(stack.isElementInStack("1"));
    }

    @Test
    public void notContainAnItemNotPushed()
    {
        assertFalse(stack.isElementInStack("1"));
    }

    @Test
    public void replaceTheValueOfAnElement()
    {
        stack.pushElement("6");
        stack.pushElement("2");
        stack.pushElement("6");
        stack.replaceAll("6", "1");
        assertEquals("1", stack.popLastElement());
        stack.popLastElement();
        assertEquals("1", stack.popLastElement());
    }

    @Test
    public void throwExceptionWhenEmptyAndPop()
    {
        try
        {
            stack.popLastElement();
            fail();
        }
        catch (IllegalStateException e)
        {
        }
    }
}
