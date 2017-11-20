package com.wzh.thik.in.java.twelve;/**
 * Created by Administrator on 2017/11/20.
 */

/**
 * @author:Administrator
 * @date:2017/11/20
 * @description:
 */
class Annoyance extends Exception{}
class Sneeze extends  Annoyance{}
public class ExThirty {
    static void throwRuntimeException(int type) { try {
        switch(type) {
            case 0: throw new Annoyance();
            case 1: throw new Sneeze();
            default: return;
        }
    } catch(Exception e) { // Adapt to unchecked: throw new RuntimeException(e);
    }
    }

    public static void main(String[] args) {
        for(int i = 0; i < 2; i++)


            try {
                throwRuntimeException(i);
            } catch(RuntimeException re) { try {
                throw re.getCause();
            } catch(Sneeze e) { System.out.println("Caught Sneeze");
            } catch(Annoyance e) { System.out.println("Caught Annoyance");
            } catch(Throwable t) { System.out.println(t);
            }
            }
    }
}
