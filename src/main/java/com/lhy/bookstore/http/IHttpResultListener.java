package com.lhy.bookstore.http;


import com.app.library.net.IHttpListener;

public interface IHttpResultListener<T> extends IHttpListener {
	void Success(T object);
	void Error(String msg);
}
