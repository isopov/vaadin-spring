package com.vaadin.demo.tutorial.addressbook;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.vaadin.event.ItemClickEvent;
import com.vaadin.event.ItemClickEvent.ItemClickListener;

@Component
@Scope("session")
public class Controller implements ItemClickListener {
//	private static final long serialVersionUID = 1L;
//
//	private PersonContainer dataSource = PersonContainer.createWithTestData();
//
	@Override
	public void itemClick(ItemClickEvent event) {
//		if (event.getSource() == tree) {
//			Object itemId = event.getItemId();
//			if (itemId != null) {
//				if (NavigationTree.SHOW_ALL.equals(itemId)) {
//					// clear previous filters
//					getDataSource().removeAllContainerFilters();
//					showListView();
//				} else if (NavigationTree.SEARCH.equals(itemId)) {
//					showSearchView();
//				} else if (itemId instanceof SearchFilter) {
//					search((SearchFilter) itemId);
//				}
//			}
//		}
	}
//
//	public PersonContainer getDataSource() {
//		return dataSource;
//	}
//	
//	public void search(SearchFilter searchFilter) {
//		// clear previous filters
//		getDataSource().removeAllContainerFilters();
//		// filter contacts with given filter
//		getDataSource().addContainerFilter(searchFilter.getPropertyId(),
//				searchFilter.getTerm(), true, false);
//		showListView();
//
//		getMainWindow().showNotification(
//				"Searched for " + searchFilter.getPropertyId() + "=*"
//						+ searchFilter.getTerm() + "*, found "
//						+ getDataSource().size() + " item(s).",
//				Notification.TYPE_TRAY_NOTIFICATION);
//	}

}
