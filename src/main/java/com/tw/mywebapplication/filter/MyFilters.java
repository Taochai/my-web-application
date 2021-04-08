package com.tw.mywebapplication.filter;

import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

public class MyFilters implements TypeFilter {
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) {
        System.out.println("***************************" + metadataReader.getClassMetadata().getClassName());
        return false;
//        return true;
    }
}
