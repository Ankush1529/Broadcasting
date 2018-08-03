# Broadcasting
The implemented code will broadcast a message at a regualr intervals of time and all other pc devices in the network will respond to the broadcast with their ip addresses and also the time of at which their ip is discovered.
This piece of code was integrated for finding out neighbouring ip addresses of machines during a post disaster situation where communication.
The code sends a check message at regular intervals of 5 secs broadcasting from the pc and is waiting for any response from the client to acknowledge their presence.
The server responds by listing out the time and the ip addresses of all the machines responding to it (one being the broadcasting machine itself).
On entering the command "list", all the ip addresses are listed.
