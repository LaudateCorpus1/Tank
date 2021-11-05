/**
 * Copyright 2011 Intuit Inc. All Rights Reserved
 */
package com.intuit.tank.util;

/*
 * #%L
 * Intuit Tank data model
 * %%
 * Copyright (C) 2011 - 2015 Intuit Inc.
 * %%
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * #L%
 */

import java.util.Comparator;

import com.intuit.tank.project.BaseEntity;

/**
 * CreateDateComparator
 * 
 * @author dangleton
 * 
 */
public class ModifiedDateComparator implements Comparator<BaseEntity> {
    private SortOrder order;

    /**
     * 
     */
    public ModifiedDateComparator() {
        this(SortOrder.ASCENDING);
    }

    /**
     * @param order
     */
    public ModifiedDateComparator(SortOrder order) {
        this.order = order;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int compare(BaseEntity o1, BaseEntity o2) {
        if (order == SortOrder.ASCENDING) {
            return o1.getModified().compareTo(o2.getModified());
        } else {
            return o2.getModified().compareTo(o1.getModified());
        }
    }

    public enum SortOrder {
        ASCENDING, DESCENDING
    }

}
