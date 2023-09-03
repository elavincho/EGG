import { API_RICKMORTY } from "../constants/Api.constants";

class RickAndMortyService {
  async getAllCharacters() {
    const response = await fetch(API_RICKMORTY.CHARACTERS());
    //Interceptor
    return response.json();
  }

  async getCharactersById(id) {
    const response = await fetch(API_RICKMORTY.CHARACTERS_BY_ID(id));
    //Interceptor
    return response.json();
  }
}

export default new RickAndMortyService();

