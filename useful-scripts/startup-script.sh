sleep 10
sudo apt update
sudo apt install -y nginx


cd /var/www
sudo git clone https://github.com/federico-benassi/cloud-test-projects.git
sudo rm html/*
sudo cp cloud-test-projects/static-website/* html/
sudo mv /var/www/html/test.html /var/www/html/index.html

# ------ Till here is for http -------

sudo mkdir /etc/nginx/ssl-certs
sudo openssl req -new -newkey rsa:4096 -days 365 -nodes -x509 -subj "/C=US/ST=Denial/L=Springfield/O=Dis/CN=www.example.com" -keyout /etc/nginx/ssl-certs/nginx.key  -out /etc/nginx/ssl-certs/nginx.crt

sudo sed -i 's/# listen 443 ssl default_server;/listen 443 ssl default_server;listen [::]:443 default_server;ssl on;ssl_certificate         \/etc\/nginx\/ssl-certs\/nginx.crt;ssl_certificate_key     \/etc\/nginx\/ssl-certs\/nginx.key;/g' /etc/nginx/sites-available/default

sudo systemctl restart nginx
# ------ Self signed Https Enabled -------

