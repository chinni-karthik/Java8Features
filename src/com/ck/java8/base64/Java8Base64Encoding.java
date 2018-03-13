package com.ck.java8.base64;

import java.util.Base64;
import java.util.UUID;
import java.io.UnsupportedEncodingException;

public class Java8Base64Encoding {

	public static void main(String args[]) {

		try {

			// Encode using basic encoder
			String base64encodedString = Base64.getEncoder().encodeToString("TutorialsPoint?java8".getBytes("utf-8"));
			System.out.println("Base64 Encoded String (Basic) :"+ base64encodedString);

			// Decode
			byte[] base64decodedBytes = Base64.getDecoder().decode(base64encodedString);

			System.out.println("Original String: "+ new String(base64decodedBytes, "utf-8"));
			base64encodedString = Base64.getUrlEncoder().encodeToString("TutorialsPoint?java8".getBytes("utf-8"));
			System.out.println("Base64 Encoded String (URL) :"+ base64encodedString);

			StringBuilder stringBuilder = new StringBuilder();

			for (int i = 0; i < 10; ++i) {
				stringBuilder.append(UUID.randomUUID().toString());
			}

			byte[] mimeBytes = stringBuilder.toString().getBytes("utf-8");
			String mimeEncodedString = Base64.getMimeEncoder().encodeToString(mimeBytes);
			System.out.println("Base64 Encoded String (MIME) :"+ mimeEncodedString);

		} catch (UnsupportedEncodingException e) {
			System.out.println("Error :" + e.getMessage());
		}
	}
}


/*
Original String: TutorialsPoint?java8
Base64 Encoded String (URL) :VHV0b3JpYWxzUG9pbnQ_amF2YTg=
Base64 Encoded String (MIME) :YTZkYzNhM2ItMmY5OS00NzNmLTk0ZGUtYzU5NzQ3ZWM0NzQ5MDU4YzYzNjUtYzczMi00YjQ2LWFk
NWMtYjE5YTlhNjg0ZDkwMGE4ZjZiNmQtZjg4MC00NmFlLTkwMjEtNGNlMDM5NzA3NjI4MGVjYTgy
MWItZGU1Ny00YzUwLWJkYWEtMWM0YjQ3MTExYWNhZDFhNTRjN2YtMDQ0NS00ODJlLTk4YzctOGI5
YTY5OWJiODE4YjAzOWU3NTYtZDIyYy00OTM4LTkyY2QtNjUyYTZhYWE5OWEyOTFmYzQ3M2UtYTdh
ZC00NjM0LTkwYTAtM2U2YmI1N2I4YmIzZjI4OTQwN2MtODYyNy00NjIwLThhNjctMDdmNDc2M2Qy
Mjc1MGEzMjhiY2QtMjkxZS00NjliLWJlZWYtOGMyZTQ5NWI4NWQzZjk1NjdhMTYtYmVkNy00ODg4
LWI4NTgtMTQzODBhZGYxNGY2
*/