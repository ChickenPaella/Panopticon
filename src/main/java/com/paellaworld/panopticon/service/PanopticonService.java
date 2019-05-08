package com.paellaworld.panopticon.service;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

@Service
public class PanopticonService {
	private static final String USER_AGENT = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/33.0.1750.152 Safari/537.36";

	public Document getDocument() {
		String url = "http://www.daum.net";
		try {
			Connection conn = Jsoup.connect(url).header("Content-Type", "application/json;charset=UTF-8")
					.userAgent(USER_AGENT).method(Connection.Method.GET).ignoreContentType(true);

			Document doc = conn.get();
			return doc;
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}
}
