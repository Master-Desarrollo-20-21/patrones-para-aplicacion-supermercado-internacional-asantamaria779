package supermarket.controllers;

import supermarket.models.Session;

public abstract class UseCaseController {

	protected Session session;

	UseCaseController(Session session) {
		this.session = session;
	}

}
