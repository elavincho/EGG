export const API_RICKMORTY = {
    URL: "https://rickandmortyapi.com/api",
    //con esta funcion llamamos a todos los personajes
    CHARACTERS : function(){
        return `${this.URL}/character`
    },
    //esta funcion trae los personajes por id
    CHARACTERS_BY_ID : function (id) {
        return `${this.URL}/character/${id}`
    }
};