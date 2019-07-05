const url = "./coolitude";

const vm = new Vue({
    el: '#app',
    data: {
        result: null,
        prenom: "Jean-Pierre",

    },

    methods: {
        calcul: function() {

            axios.get(url + "?name=" + this.prenom).then(response => {
                this.result = response.data;
        }).catch(error => {
            console.log(error.response)

                alert(error.response.data)
        });
        }
    }

});
