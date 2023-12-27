import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

public class AviaSoulsTest {
    @Test
    public void testCompareTo() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Санкт-Петербург", "Калининград", 100, 10, 13);
        Ticket ticket2 = new Ticket("Санкт-Петербург", "Калининград", 500, 11, 13);
        Ticket ticket3 = new Ticket("Москва", "Мурманск", 300, 10, 13);
        Ticket ticket4 = new Ticket("Казань", "Санкт-Петербург", 600, 14, 17);
        Ticket ticket5 = new Ticket("Санкт-Петербург", "Калининград", 150, 9, 12);
        Ticket ticket6 = new Ticket("Казань", "Уфа", 100, 10, 12);
        Ticket ticket7 = new Ticket("Москва", "Новосибирск", 400, 9, 13);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] actual = manager.search("Санкт-Петербург","Калининград");
        Ticket[] expected = {ticket1,ticket5,ticket2  };

        Assertions.assertArrayEquals(expected ,actual ) ;
    }
    @Test
    public void testCompareTo2() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Санкт-Петербург", "Калининград", 100, 10, 13);
        Ticket ticket2 = new Ticket("Санкт-Петербург", "Калининград", 500, 11, 13);
        Ticket ticket3 = new Ticket("Москва", "Мурманск", 300, 10, 13);
        Ticket ticket4 = new Ticket("Казань", "Санкт-Петербург", 600, 14, 17);
        Ticket ticket5 = new Ticket("Санкт-Петербург", "Калининград", 150, 9, 12);
        Ticket ticket6 = new Ticket("Казань", "Уфа", 100, 10, 12);
        Ticket ticket7 = new Ticket("Москва", "Новосибирск", 400, 9, 13);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] actual = manager.search("Санкт-Петербург","Москва");
        Ticket[] expected = { };

        Assertions.assertArrayEquals(expected ,actual ) ;
    }
    @Test
    public void testCompareTo3() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Санкт-Петербург", "Калининград", 100, 10, 13);
        Ticket ticket2 = new Ticket("Санкт-Петербург", "Калининград", 500, 11, 13);
        Ticket ticket3 = new Ticket("Москва", "Мурманск", 300, 10, 13);
        Ticket ticket4 = new Ticket("Казань", "Санкт-Петербург", 600, 14, 17);
        Ticket ticket5 = new Ticket("Санкт-Петербург", "Калининград", 150, 9, 12);
        Ticket ticket6 = new Ticket("Казань", "Уфа", 100, 10, 12);
        Ticket ticket7 = new Ticket("Москва", "Новосибирск", 400, 9, 13);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] actual = manager.search("Казань","Уфа");
        Ticket[] expected = {ticket6};

        Assertions.assertArrayEquals(expected ,actual ) ;
    }
    @Test
    public void testComparator() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Санкт-Петербург", "Калининград", 100, 13, 15);
        Ticket ticket2 = new Ticket("Санкт-Петербург", "Калининград", 500, 14, 18);
        Ticket ticket3 = new Ticket("Москва", "Мурманск", 300, 10, 11);
        Ticket ticket4 = new Ticket("Казань", "Санкт-Петербург", 600, 14, 18);
        Ticket ticket5 = new Ticket("Санкт-Петербург", "Калининград", 150, 10, 13);
        Ticket ticket6 = new Ticket("Казань", "Уфа", 100, 10, 12);
        Ticket ticket7 = new Ticket("Москва", "Новосибирск", 400, 9, 13);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Comparator <Ticket > comparator = new TicketTimeComparator();

        Ticket[] actual = manager.search("Санкт-Петербург","Москва", comparator );
        Ticket[] expected = { };

        Assertions.assertArrayEquals(expected ,actual ) ;
    }
    @Test
    public void testComparator2() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Санкт-Петербург", "Калининград", 100, 13, 15);
        Ticket ticket2 = new Ticket("Санкт-Петербург", "Калининград", 500, 14, 18);
        Ticket ticket3 = new Ticket("Москва", "Мурманск", 300, 10, 11);
        Ticket ticket4 = new Ticket("Казань", "Санкт-Петербург", 600, 14, 18);
        Ticket ticket5 = new Ticket("Санкт-Петербург", "Калининград", 150, 10, 13);
        Ticket ticket6 = new Ticket("Казань", "Уфа", 100, 10, 12);
        Ticket ticket7 = new Ticket("Москва", "Мурманск", 400, 9, 13);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Comparator <Ticket > comparator = new TicketTimeComparator();

        Ticket[] actual = manager.search("Москва","Мурманск", comparator );
        Ticket[] expected = { ticket3 ,ticket7  };

        Assertions.assertArrayEquals(expected ,actual ) ;
    }
    @Test
    public void testComparator3() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Санкт-Петербург", "Калининград", 200, 13, 15);
        Ticket ticket2 = new Ticket("Санкт-Петербург", "Калининград", 500, 14, 18);
        Ticket ticket3 = new Ticket("Москва", "Мурманск", 300, 10, 11);
        Ticket ticket4 = new Ticket("Казань", "Санкт-Петербург", 600, 14, 18);
        Ticket ticket5 = new Ticket("Санкт-Петербург", "Калининград", 100, 10, 13);
        Ticket ticket6 = new Ticket("Казань", "Уфа", 100, 10, 12);
        Ticket ticket7 = new Ticket("Москва", "Мурманск", 400, 9, 13);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Comparator <Ticket > comparator = new TicketTimeComparator();

        Ticket[] actual = manager.search("Санкт-Петербург","Калининград", comparator );
        Ticket[] expected = { ticket5,ticket1,ticket2  };

        Assertions.assertArrayEquals(expected ,actual ) ;
    }
    @Test
    public void testComparator4() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Санкт-Петербург", "Калининград", 200, 13, 15);
        Ticket ticket2 = new Ticket("Санкт-Петербург", "Калининград", 500, 14, 18);
        Ticket ticket3 = new Ticket("Москва", "Мурманск", 300, 10, 11);
        Ticket ticket4 = new Ticket("Казань", "Санкт-Петербург", 600, 14, 18);
        Ticket ticket5 = new Ticket("Санкт-Петербург", "Калининград", 100, 10, 13);
        Ticket ticket6 = new Ticket("Казань", "Уфа", 100, 10, 12);
        Ticket ticket7 = new Ticket("Москва", "Мурманск", 400, 9, 13);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Comparator <Ticket > comparator = new TicketTimeComparator();

        Ticket[] actual = manager.search("Казань","Уфа", comparator );
        Ticket[] expected = { ticket6};

        Assertions.assertArrayEquals(expected ,actual ) ;
    }
}
