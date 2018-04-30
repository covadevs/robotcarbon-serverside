package br.com.robotcarbon;

import java.io.IOException;
import java.net.ServerSocket;

public class Server {
	private ServerSocket servidor;
	
	public Server(int porta) throws IOException {
		this.servidor = new ServerSocket(porta);
	}

	public ServerSocket getServidor() {
		return servidor;
	}

	public void setServidor(ServerSocket servidor) {
		this.servidor = servidor;
	}
}
