package br.com.beirute.cidades

import br.com.beirute.DataAndHeader

class Goiania implements DataAndHeader {
    @Override
    String getName() {
        return "Goiania"
    }

    @Override
    String getUrl() {
        return "http://goiania-go.beirutescan.com/raw_data"
    }

    @Override
    Map getData() {
        return [
                'pokemon':'true',
                'pokestops':'false',
                'luredonly':'true',
                'gyms':'false',
                'scanned':'false',
                'spawnpoints':'false',
                'swLat':'-16.827674489053678',
                'swLng':'-49.487695939848095',
                'neLat':'-16.61427946636945',
                'neLng':'-49.01871705801216',
                'reids':'',
                'eids':'1,2,4,5,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,27,28,29,30,32,33,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,60,61,62,63,64,66,67,69,70,71,72,73,74,75,77,78,79,80,81,82,84,85,86,88,90,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,114,116,117,118,119,120,121,123,124,125,126,127,129,133,138,140,141,142,152,153,154,155,156,157,158,159,160,161,162,163,164,165,166,167,168,169,170,171,176,177,178,180,183,184,185,187,188,189,190,191,193,194,195,198,200,202,203,204,206,207,209,210,211,213,214,215,216,217,218,219,220,221,223,224,225,226,227,228,229,231,232,234,302,353,354,355,356',
                'token':'yTOJmAmICdyFVsuW1W1TiALtEDF+REdqrdjzDBfrKKM='
        ]
    }

    @Override
    Map getHeaders() {
        return [
                'Accept'             : 'application/json, text/javascript, */*; q=0.01',
                'Accept-Encoding'    : 'gzip, deflate',
                'Accept-Language'    : 'pt-BR,pt;q=0.8,en-US;q=0.6,en;q=0.4,es;q=0.2,ru;q=0.2,nb;q=0.2',
                'Content-Length'     : '1490',
                'Content-Type'       : 'application/x-www-form-urlencoded; charset=UTF-8',
                'Cookie'             : '_ga=GA1.2.395839863.1509032922; PHPSESSID=69mak5l2fen12utkl1vhrf0730',
                'Host'               : 'goiania-go.beirutescan.com',
                'Origin'             : 'http://goiania-go.beirutescan.com',
                'Proxy-Authorization': 'Basic cmljYXJkby5nb2Jibzo4MTMyNjQxNA==',
                'Proxy-Connection'   : 'keep-alive',
                'Referer'            : 'http://goiania-go.beirutescan.com/',
                'User-Agent'         : 'Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36',
                'X-Requested-With'   : 'XMLHttpRequest'
        ]
    }
}
