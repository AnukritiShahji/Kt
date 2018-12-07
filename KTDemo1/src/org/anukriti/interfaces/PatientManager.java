package org.anukriti.interfaces;

import java.util.PriorityQueue;
import java.util.Scanner;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PatientManager 
{
public static void main(String[] args) {
PatientManager pm = new PatientManager();
PriorityQueue<Patient> pq = new PriorityQueue<Patient>();
PriorityQueue<Patient> waitingList;
int receive = pm.start();
System.out.println(receive);
}

public int start() {
Scanner sc = new Scanner(System.in);
Map<Integer, String> mp = new HashMap<Integer, String>();
mp.put(1, "New Patient.");
mp.put(2, "Next Patient.");
mp.put(3, "Waiting List.");
mp.put(4, "Exit.");

for (Entry<Integer, String> entry : mp.entrySet())
System.out.println(entry.getKey() + ") " + entry.getValue());

System.out.println("Choose an item form the menu.");
int inp = sc.nextInt();
while (inp > 4 || inp < 1 || (inp>='a' && inp<='z') || (inp>='A' && inp<='Z'))
{
System.out.println("Wrong input");
System.out.println("Choose an item form the menu.");
inp = sc.nextInt();
}

if (mp.containsKey(inp))
System.out.println(mp.get(inp));
        return inp;
}
}
