package com.wondersgroup.easyexcel.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author: lizhu@wondesgroup.com
 * @date: 2020/11/6 15:57
 * @description:
 */
@ExtendWith(MockitoExtension.class)
class BookControllerTest extends Mockito {

    @Mock
    List<String> mockList;

    @Test
    void verify_SimpleInvocationOnMock() {
        mockList.size();
        Mockito.verify(mockList).size();
    }

    @Test
    void verify_OrderedInvocationsOnMock() {
        mockList.size();
        mockList.add("add a parameter");
        mockList.clear();

        InOrder inOrder = inOrder(mockList);
        inOrder.verify(mockList).size();
        inOrder.verify(mockList).add("add a parameter");
        inOrder.verify(mockList).clear();
    }

    @Mock
    public Map<String, Integer> mockMap;
    @Test
    public void whenConfigNonVoidReturnMethodToThrowEx_thenExIsThrown() {
        when(mockMap.get(anyString())).thenThrow(NullPointerException.class);
        assertThrows(NullPointerException.class, () ->    mockMap.get("mghio"));
    }
}