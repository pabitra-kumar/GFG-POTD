
// N people from 1 to N are standing in the queue at a movie ticket counter. It is a weird counter, as it distributes tickets to the first K people and then the last K people and again first K people and so on, once a person gets a ticket moves out of the queue. The task is to find the last person to get the ticket.


public class TicketCounter {
    public static void main(String[] args) {
        System.out.println(distributeTicket(13, 3));
    }
    public static int distributeTicket(int N,int K)
    {
        int i = N/K;
        int j = N%K;
        if(j==0)
        {
            if(i%2 == 0)
            {
                return i/2*K + 1;
            }
            else
            {
                return i/2*K + K;
            }
        }
        else
        {
            if(i%2 == 0)
            {
                return i/2*K + j ;
            }
            else
            {
                return i/2*K + K + 1;
            }
        }
    }
}