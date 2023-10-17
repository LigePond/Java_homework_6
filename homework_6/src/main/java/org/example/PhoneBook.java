package org.example;

import java.util.*;
import java.util.stream.Collectors;


class PhoneBook {
    private HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer phoneNum) {
        ArrayList<Integer> phoneNumbers = phoneBook.getOrDefault(name, new ArrayList<>());
        phoneNumbers.add(phoneNum);
        phoneBook.put(name, phoneNumbers);
    }

    public ArrayList<Integer> find(String name) {
        return phoneBook.getOrDefault(name, new ArrayList<>());
    }

    public List<Map.Entry<String, ArrayList<Integer>>> getPhoneBook() {
        return phoneBook.entrySet().stream().sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size())).collect(Collectors.toList());
    }

}
