package practice;

import java.util.HashSet;
import java.util.Set;

public class SetFilter {
  public static void main(String[] args) {
    //

      String[] arr={    "trn:tesco:fulfilmentOrder:uuid:23aeee04-abdf-44b9-a02b-bc45e37c7037",
              "trn:tesco:fulfilmentOrder:uuid:23aeee04-abdf-44b9-a02b-bc45e37c7037",
              "trn:tesco:fulfilmentOrder:uuid:23cee1dc-e112-4636-9354-d9e9d349fbcf",
              "trn:tesco:fulfilmentOrder:uuid:23cee1dc-e112-4636-9354-d9e9d349fbcf",
              "trn:tesco:fulfilmentOrder:uuid:23aeee04-abdf-44b9-a02b-bc45e37c7037",
              "trn:tesco:fulfilmentOrder:uuid:23aeee04-abdf-44b9-a02b-bc45e37c7037",
              "trn:tesco:fulfilmentOrder:uuid:c853a84a-bc51-40dd-93c9-130ee3a2f918",
              "trn:tesco:fulfilmentOrder:uuid:dce6a63f-da2e-447c-8c2c-13d34397e1cc",
              "trn:tesco:fulfilmentOrder:uuid:dce6a63f-da2e-447c-8c2c-13d34397e1cc",
              "trn:tesco:fulfilmentOrder:uuid:23aeee04-abdf-44b9-a02b-bc45e37c7037",
              "trn:tesco:fulfilmentOrder:uuid:dce6a63f-da2e-447c-8c2c-13d34397e1cc",
              "trn:tesco:fulfilmentOrder:uuid:dce6a63f-da2e-447c-8c2c-13d34397e1cc",
              "trn:tesco:fulfilmentOrder:uuid:c853a84a-bc51-40dd-93c9-130ee3a2f918",
              "trn:tesco:fulfilmentOrder:uuid:dce6a63f-da2e-447c-8c2c-13d34397e1cc",
              "trn:tesco:fulfilmentOrder:uuid:23cee1dc-e112-4636-9354-d9e9d349fbcf",
              "trn:tesco:fulfilmentOrder:uuid:dce6a63f-da2e-447c-8c2c-13d34397e1cc",
              "trn:tesco:fulfilmentOrder:uuid:dce6a63f-da2e-447c-8c2c-13d34397e1cc",
              "trn:tesco:fulfilmentOrder:uuid:abe6feab-66a3-4fd6-91fe-24b2a16a4d27",
              "trn:tesco:fulfilmentOrder:uuid:8b4565f8-18f9-4664-a1ea-f93c13604936",
              "trn:tesco:fulfilmentOrder:uuid:abe6feab-66a3-4fd6-91fe-24b2a16a4d27",
              "trn:tesco:fulfilmentOrder:uuid:23aeee04-abdf-44b9-a02b-bc45e37c7037",
              "trn:tesco:fulfilmentOrder:uuid:dce6a63f-da2e-447c-8c2c-13d34397e1cc",
              "trn:tesco:fulfilmentOrder:uuid:abe6feab-66a3-4fd6-91fe-24b2a16a4d27",
              "trn:tesco:fulfilmentOrder:uuid:abe6feab-66a3-4fd6-91fe-24b2a16a4d27",
              "trn:tesco:fulfilmentOrder:uuid:dce6a63f-da2e-447c-8c2c-13d34397e1cc",
              "trn:tesco:fulfilmentOrder:uuid:c853a84a-bc51-40dd-93c9-130ee3a2f918",
              "trn:tesco:fulfilmentOrder:uuid:abe6feab-66a3-4fd6-91fe-24b2a16a4d27",
              "trn:tesco:fulfilmentOrder:uuid:23cee1dc-e112-4636-9354-d9e9d349fbcf",
              "trn:tesco:fulfilmentOrder:uuid:dce6a63f-da2e-447c-8c2c-13d34397e1cc",
              "trn:tesco:fulfilmentOrder:uuid:23cee1dc-e112-4636-9354-d9e9d349fbcf",
              "trn:tesco:fulfilmentOrder:uuid:c853a84a-bc51-40dd-93c9-130ee3a2f918",
              "trn:tesco:fulfilmentOrder:uuid:abe6feab-66a3-4fd6-91fe-24b2a16a4d27",
              "trn:tesco:fulfilmentOrder:uuid:abe6feab-66a3-4fd6-91fe-24b2a16a4d27",
              "trn:tesco:fulfilmentOrder:uuid:abe6feab-66a3-4fd6-91fe-24b2a16a4d27",
              "trn:tesco:fulfilmentOrder:uuid:23cee1dc-e112-4636-9354-d9e9d349fbcf",
              "trn:tesco:fulfilmentOrder:uuid:c853a84a-bc51-40dd-93c9-130ee3a2f918",
              "trn:tesco:fulfilmentOrder:uuid:23cee1dc-e112-4636-9354-d9e9d349fbcf",
              "trn:tesco:fulfilmentOrder:uuid:c853a84a-bc51-40dd-93c9-130ee3a2f918",
              "trn:tesco:fulfilmentOrder:uuid:23cee1dc-e112-4636-9354-d9e9d349fbcf",
              "trn:tesco:fulfilmentOrder:uuid:23cee1dc-e112-4636-9354-d9e9d349fbcf",
              "trn:tesco:fulfilmentOrder:uuid:23cee1dc-e112-4636-9354-d9e9d349fbcf",
              "trn:tesco:fulfilmentOrder:uuid:23cee1dc-e112-4636-9354-d9e9d349fbcf",
              "trn:tesco:fulfilmentOrder:uuid:dce6a63f-da2e-447c-8c2c-13d34397e1cc",
              "trn:tesco:fulfilmentOrder:uuid:c853a84a-bc51-40dd-93c9-130ee3a2f918",
              "trn:tesco:fulfilmentOrder:uuid:23cee1dc-e112-4636-9354-d9e9d349fbcf",
              "trn:tesco:fulfilmentOrder:uuid:23aeee04-abdf-44b9-a02b-bc45e37c7037",
              "trn:tesco:fulfilmentOrder:uuid:8b4565f8-18f9-4664-a1ea-f93c13604936",
              "trn:tesco:fulfilmentOrder:uuid:8b4565f8-18f9-4664-a1ea-f93c13604936",
              "trn:tesco:fulfilmentOrder:uuid:23cee1dc-e112-4636-9354-d9e9d349fbcf",
              "trn:tesco:fulfilmentOrder:uuid:dce6a63f-da2e-447c-8c2c-13d34397e1cc",
              "trn:tesco:fulfilmentOrder:uuid:23aeee04-abdf-44b9-a02b-bc45e37c7037",
              "trn:tesco:fulfilmentOrder:uuid:23aeee04-abdf-44b9-a02b-bc45e37c7037",
              "trn:tesco:fulfilmentOrder:uuid:23aeee04-abdf-44b9-a02b-bc45e37c7037",
              "trn:tesco:fulfilmentOrder:uuid:23aeee04-abdf-44b9-a02b-bc45e37c7037",
              "trn:tesco:fulfilmentOrder:uuid:23aeee04-abdf-44b9-a02b-bc45e37c7037",
              "trn:tesco:fulfilmentOrder:uuid:23aeee04-abdf-44b9-a02b-bc45e37c7037",
              "trn:tesco:fulfilmentOrder:uuid:abe6feab-66a3-4fd6-91fe-24b2a16a4d27",
              "trn:tesco:fulfilmentOrder:uuid:23aeee04-abdf-44b9-a02b-bc45e37c7037",
              "trn:tesco:fulfilmentOrder:uuid:23cee1dc-e112-4636-9354-d9e9d349fbcf",
              "trn:tesco:fulfilmentOrder:uuid:abe6feab-66a3-4fd6-91fe-24b2a16a4d27",
              "trn:tesco:fulfilmentOrder:uuid:abe6feab-66a3-4fd6-91fe-24b2a16a4d27",
              "trn:tesco:fulfilmentOrder:uuid:23cee1dc-e112-4636-9354-d9e9d349fbcf",
              "trn:tesco:fulfilmentOrder:uuid:23aeee04-abdf-44b9-a02b-bc45e37c7037",
              "trn:tesco:fulfilmentOrder:uuid:abe6feab-66a3-4fd6-91fe-24b2a16a4d27",
              "trn:tesco:fulfilmentOrder:uuid:c853a84a-bc51-40dd-93c9-130ee3a2f918",
              "trn:tesco:fulfilmentOrder:uuid:23cee1dc-e112-4636-9354-d9e9d349fbcf",
              "trn:tesco:fulfilmentOrder:uuid:c853a84a-bc51-40dd-93c9-130ee3a2f918",
              "trn:tesco:fulfilmentOrder:uuid:dce6a63f-da2e-447c-8c2c-13d34397e1cc",
              "trn:tesco:fulfilmentOrder:uuid:23aeee04-abdf-44b9-a02b-bc45e37c7037",
              "trn:tesco:fulfilmentOrder:uuid:abe6feab-66a3-4fd6-91fe-24b2a16a4d27",
              "trn:tesco:fulfilmentOrder:uuid:abe6feab-66a3-4fd6-91fe-24b2a16a4d27",
              "trn:tesco:fulfilmentOrder:uuid:dce6a63f-da2e-447c-8c2c-13d34397e1cc",
              "trn:tesco:fulfilmentOrder:uuid:23aeee04-abdf-44b9-a02b-bc45e37c7037",
              "trn:tesco:fulfilmentOrder:uuid:abe6feab-66a3-4fd6-91fe-24b2a16a4d27",
              "trn:tesco:fulfilmentOrder:uuid:dce6a63f-da2e-447c-8c2c-13d34397e1cc",
              "trn:tesco:fulfilmentOrder:uuid:dce6a63f-da2e-447c-8c2c-13d34397e1cc",
              "trn:tesco:fulfilmentOrder:uuid:23aeee04-abdf-44b9-a02b-bc45e37c7037",
              "trn:tesco:fulfilmentOrder:uuid:c853a84a-bc51-40dd-93c9-130ee3a2f918",
              "trn:tesco:fulfilmentOrder:uuid:dce6a63f-da2e-447c-8c2c-13d34397e1cc",
              "trn:tesco:fulfilmentOrder:uuid:23aeee04-abdf-44b9-a02b-bc45e37c7037"};

      Set<String> set=new HashSet<>();
      for(String str: arr){
          set.add(str);
      }
    System.out.println(set);
  }



}
