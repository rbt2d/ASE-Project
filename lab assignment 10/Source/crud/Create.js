/**
 * Created by mani on 11/1/2016.
 */
var MongoClient = require('mongodb').MongoClient;
var assert = require('assert');
var url = 'mongodb://man:qwerty12@ds011168.mlab.com:11168/mani';
var insertDocument = function(db, callback) {
    db.collection('mani').insert( {
        "fname" : "mani",
        "lname" : "v",
        "email": "asdfg@mail.umkc.edu",

        "password":"qwerty12"
    }, function(err, result) {
        assert.equal(err, null);
        console.log("Inserted a document into the mani collection.");
        callback();
    });
};

MongoClient.connect(url, function(err, db) {
    assert.equal(null, err);
    insertDocument(db, function() {
        db.close();
    });
});