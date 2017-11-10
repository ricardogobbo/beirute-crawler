package br.com.beirute.cidades

import br.com.beirute.DataAndHeader

class Vitoria implements DataAndHeader {

    String phpSession
    String token

    @Override
    String getName() {
        return "Vitoria"
    }

    @Override
    String getMainUrl() {
        return "https://vitoria-es.beirutescan.com/"
    }

    @Override
    String getUrl() {
        return "https://vitoria-es.beirutescan.com/raw_data"
    }

    @Override
    Map getData() {
        return [
                'pokemon'    : 'true',
                'pokestops'  : 'false',
                'luredonly'  : 'true',
                'gyms'       : 'false',
                'scanned'    : 'false',
                'spawnpoints': 'false',
                'swLat'      : '-20.4748041682858',
                'swLng'      : '-40.7849257176627',
                'neLat'      : '-20.0567588901895',
                'neLng'      : '-39.8469679539903',
                'eids'       : '1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,27,28,29,30,32,33,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,60,61,62,63,64,66,67,69,70,71,72,73,74,75,77,78,79,80,81,82,84,85,86,88,90,92,93,95,96,98,99,100,101,102,103,104,105,106,107,108,109,110,111,114,116,117,118,119,120,121,123,124,125,126,127,129,133,138,140,141,152,153,155,156,158,159,161,162,163,164,165,166,167,168,169,170,171,177,178,180,183,184,185,187,188,189,190,191,193,194,195,198,200,202,203,204,206,207,209,210,211,213,214,215,216,217,218,219,220,221,223,224,225,226,227,228,229,231,234,302,353,354,355',
                'token'      : token
        ]
    }

    @Override
    Map getHeaders() {
        return ['Content-Type': 'application/x-www-form-urlencoded; charset=UTF-8',
                'Cookie'      : 'PHPSESSID=' + phpSession,
                'Host'        : 'vitoria-es.beirutescan.com',
                'Origin'      : 'http://vitoria-es.beirutescan.com',
                'Referer'     : 'http://vitoria-es.beirutescan.com/'

        ]
    }

    @Override
    void setPhpSession(String phpSession) {
        this.phpSession = phpSession
    }

    void setToken(String token) {
        this.token = token
    }

}
