package de.thuir.privat.Tourverwaltung.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import de.thuir.privat.Tourverwaltung.dao.ApiRequestDao;
import de.thuir.privat.Tourverwaltung.model.ApiRequest;

@Transactional
public class ApiRequestService {

	@Autowired
	private ApiRequestDao apiRequestDao;

	public void create(ApiRequest apiRequest) {
		apiRequestDao.create(apiRequest);
	}
}