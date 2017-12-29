package com.wzh.thik.in.java.seventeen;/**
 * Created by Administrator on 2017/12/12.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/**
 * @author:Administrator
 * @date:2017/12/12
 * @description:
 */
interface SListIterator<T> {
    boolean hasNext();
    T next();
    void remove();
    void add(T element);
}

class SList<T> {

    private final Link<T> header = new Link<T>(null, null); SList() { header.next = header; }
    public String toString() {
        StringBuilder buf = new StringBuilder(); buf.append("[");
        for(SListIterator<T> it = iterator(); it.hasNext();) { T element = it.next();
            buf.append(element == this ? "(this SList)" : String.valueOf(element));
            if(it.hasNext())
                buf.append(", ");
        }
        buf.append("]"); return buf.toString();
    }
    public SListIterator<T> iterator() { return new SListIteratorImpl();
    }
    private static class Link<T> { T element;
        Link<T> next;
        Link(T element, Link<T> next) { this.element = element; this.next = next;
        }
    }
    private class SListIteratorImpl implements SListIterator<T> {
        private Link<T> lastReturned = header; private Link<T> next;
        SListIteratorImpl() { next = header.next; }
        public boolean hasNext() { return next != header; } public T next() {
            if(next == header)
                throw new NoSuchElementException(); lastReturned = next;
            next = next.next;
            return lastReturned.element;
        }
        public void remove() { if(lastReturned == header)
            throw new IllegalStateException();
            for(Link<T> curr = header; ; curr = curr.next)
            if(curr.next == lastReturned) { curr.next = lastReturned.next; break;
            }
            lastReturned = header;
        }
        public void add(T element) { lastReturned = header;
            Link<T> newLink = new Link<T>(element, next);
            if(header.next == header)	// Empty list
                header.next = newLink; else {
                 for(Link<T> curr = header; ; curr = curr.next)
                if(curr.next == next) {
                    curr.next = newLink; break;
                }
            }
        }
    }
}


public class ExEight {
    public static void main(String[] args) {
        System.out.println("Demonstrating SListIterator..."); SList<String> sl = new SList<String>(); System.out.println(sl);
        SListIterator<String> slit = sl.iterator(); slit.add("One");
        slit.add("Two");
        slit.add("Three"); System.out.println(slit.hasNext()); System.out.println(sl);
        slit = sl.iterator(); slit.add("Four");
        for(; slit.hasNext();)
            System.out.println(slit.next()); System.out.println(sl);
        slit = sl.iterator(); System.out.println(slit.next()); slit.remove(); System.out.println(slit.next()); System.out.println(sl);
            System.out.println("\nDemonstrating ListIterator...");
        List<String> l = new ArrayList<String>();
        System.out.println(l);
        ListIterator<String> lit = l.listIterator(); lit.add("One");
        lit.add("Two");
        lit.add("Three"); System.out.println(lit.hasNext()); System.out.println(l);
        lit = l.listIterator(); lit.add("Four");
        for(; lit.hasNext();)
            System.out.println(lit.next()); System.out.println(l);
        lit = l.listIterator(); System.out.println(lit.next());
        lit.remove();
        System.out.println(lit.next());
        System.out.println(l);

    }
}
