#!/usr/bin/env python
# -*- coding:utf-8 -*-

from pyapollo import ApolloClient
from flask import Flask

app = Flask(__name__)


@app.route('/')
def hello_world():
    x = client.get_value("timeout", 10, "application")
    return x


client = ApolloClient(app_id="test01", cluster="cluster1",
                      config_server_url="http://10.14.41.63:8080", cache_file_path="./")

if __name__ == '__main__':
    client.start()
    app.run(port=44556)
