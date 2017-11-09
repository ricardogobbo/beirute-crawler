package br.com.beirute.cidades

import br.com.beirute.DataAndHeader

/**
 * Created by ricardo.gobbo on 09/11/2017.
 */
class SaoPaulo implements DataAndHeader {


    @Override
    String getName() {
        return "Sao Paulo"
    }

    @Override
    String getUrl() {
        return "http://saopaulo-sp.beirutescan.com/raw_data"
    }

    @Override
    Map getData() {
        return ['pokemon'    : 'true',
                'pokestops'  : 'false',
                'luredonly'  : 'true',
                'gyms'       : 'false',
                'scanned'    : 'false',
                'spawnpoints': 'false',
                'swLat':'-23.673698957671103',
                'swLng':'-46.868878190039036',
                'neLat':'-23.46947418875583',
                'neLng':'-46.39989930820309',
                'reids'      : '',
                'eids'       : '1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,27,28,29,30,32,33,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,60,61,62,63,64,66,67,69,70,71,72,73,74,75,77,78,79,80,81,82,84,85,86,88,90,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,114,116,117,118,119,120,121,123,124,125,126,127,129,133,138,140,141,142,152,153,155,156,158,159,161,162,163,164,165,166,167,168,169,170,171,177,178,180,183,184,185,187,188,189,190,191,193,194,195,198,200,202,203,204,206,207,209,210,211,213,214,215,216,217,218,219,220,221,223,224,225,226,227,228,229,231,232,234,302,353,354,355,356',
                'token'      : 'NOo3QNKAbpdawlmuvLz+DfRaarN4BtiQy4wk2pdcgP4=']
    }

    @Override
    Map getHeaders() {
        return ['Content-Type'       : 'application/x-www-form-urlencoded; charset=UTF-8',
                'Cookie'             : 'PHPSESSID=2b86meo22n9ju4ka7ead3al056',
                'Host'               : 'saopaulo-sp.beirutescan.com',
                'Origin'             : 'http://saopaulo-sp.beirutescan.com',
                'Referer'            : 'http://saopaulo-sp.beirutescan.com/'
        ]
    }
}
