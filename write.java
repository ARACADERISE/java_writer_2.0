package write.write;

import java.io.File;
//import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.*; 
import convert_to_json.convert_to_json.convert_to_json;

public class write {

  private String data_is;
  private String insert_by_data;
  private convert_to_json converter = new convert_to_json();

  public String get_data(String data_info, boolean can_read) {
    if(can_read) {
      this.insert_by_data = data_info;
      System.out.println("Connected To: " + this.insert_by_data);
      return this.insert_by_data;
    } else {
      return "Failed";
    }
  }

  public void write_data(ArrayList<String> data_to_write, ArrayList<String> add_more, boolean is_ready) {
    for(String d: data_to_write) {
      this.data_is = d;
    }
    while(is_ready) {
      try {
        File create_txt_file = new File("//home//runner//info.txt");
        FileWriter write_file = new FileWriter(create_txt_file);
        write_file.write("DATA: "+this.data_is);
        write_file.close();
        converter.JSON_IT(this.data_is);
      } catch(Exception e) {
        System.out.println(e);
      }
      break;
    }
  }
}
