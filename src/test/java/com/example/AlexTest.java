package com.example;

import org.junit.Assert;
import org.junit.Test;


import java.util.List;

public class AlexTest {

    @Test
    public void testAlexGetKittens() throws Exception {
        Alex alex = new Alex();
        int actual = alex.getKittens();
        Assert.assertEquals(0, actual);
    }

    @Test
    public void testAlexGetFriends() throws Exception {
        Alex alex = new Alex();
        List<String> actual = alex.getFriends();
        List<String> expected = List.of("Марти", "Глория", "Мелман");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetAlexPlaceOfLiving() throws Exception {
        Alex alex = new Alex();
        String actual = alex.getPlaceOfLiving();
        String expected = "Нью-Йоркский Зоопарк";
        Assert.assertEquals(expected, actual);
    }
}