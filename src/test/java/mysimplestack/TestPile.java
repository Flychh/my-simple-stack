package mysimplestack;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestPile {
    @Test
    public void testCreateEmptyStack(){
        Stack st = new Stack();
        assertTrue("Une nouvelle pile est vide", st.isEmpty());
        assertEquals("Une pile à une taille de 0", 0, st.getSize());
    }

    @Test
    public void testPush() throws EmptyStackException{
        Stack st = new Stack();
        Item it = new Item();
        st.push(it);
        assertFalse("La pile n'est pas vide", st.isEmpty());
        assertEquals("La pile contient un item", 1, st.getSize());
        assertSame("L'item en haut de pile est le meme que celui insert", it, st.peek());
    }

    @Test(expected  = mysimplestack.EmptyStackException.class)
    public void testPop() throws EmptyStackException {
        Stack st = new Stack();
        Item it1 = new Item();
        Item it2 = new Item();
        st.pop();
        st.push(it1);
        st.push(it2);
        st.pop();
        assertFalse("Pile non vide", st.isEmpty());
        assertSame("L'item en haut de pile est le meme que celui du bas de la pile", it1, st.peek());
    }

    public void testGetItem () {
        Item it = new Item();
        int item = it.getItem();
        assertEquals("L'item est le meme que celui dans l'objet item", item, it.getItem());
    }

}
