package FileBuilder;


import java.awt.Desktop;
import java.io.*;

public class CreateFile {
        public void run() throws IOException {

        File f = new File("public-html/test.html");
        BufferedWriter bw = new BufferedWriter(new FileWriter(f));
        bw.write("<html><body>" +
        "<style>\n" +
        "body {\n" +
        "  background-color: linen;\n" +
        "  text-align:center;\n" +
        "}\n" +
        "body {\n" +
        "    color: #000000;\n" +
        "  background: #f5f5f5;\n" +
        "  font-family: 'Varela Round', sans-serif;\n" +
        "  font-size: 13px;\n" +
        "  }\n" +
        "  .table-wrapper {\n" +
        "    background: #fff;\n" +
        "    padding: 20px 25px;\n" +
        "    margin: 30px 0;\n" +
        "  border-radius: 3px;\n" +
        "    box-shadow: 0 1px 1px rgba(0,0,0,.05);\n" +
        "  }\n" +
        "  .table-title {\n" +
        "  padding-bottom: 15px;\n" +
        "  background: #379EC1;\n" +
        "  color: #fff;\n" +
        "  padding: 16px 30px;\n" +
        "  margin: -20px -25px 10px;\n" +
        "  border-radius: 3px 3px 0 0;\n" +
        "  }\n" +
        "  .table-title h2 {\n" +
        "  margin: 5px 0 0;\n" +
        "  font-size: 24px;\n" +
        "  }\n" +
        "  .table-title .btn-group {\n" +
        "  float: right;\n" +
        "  }\n" +
        "  .table-title .btn {\n" +
        "  color: #fff;\n" +
        "  float: right;\n" +
        "  font-size: 13px;\n" +
        "  border: none;\n" +
        "  min-width: 50px;\n" +
        "  border-radius: 3px;\n" +
        "  border: none;\n" +
        "  outline: none !important;\n" +
        "  margin-left: 10px;\n" +
        "  }\n" +
        "  .table-title .btn i {\n" +
        "  float: left;\n" +
        "  font-size: 21px;\n" +
        "  margin-right: 5px;\n" +
        "  }\n" +
        "  .table-title .btn span {\n" +
        "  float: left;\n" +
        "  margin-top: 3px;\n" +
        "  }\n" +
        "  table.table tr th, table.table tr td {\n" +
        "    border-color: #e9e9e9;\n" +
        "  padding: 12px 15px;\n" +
        "  vertical-align: middle;\n" +
        "  }\n" +
        "  table.table tr th:first-child {\n" +
        "  width: 60px;\n" +
        "  }\n" +
        "  table.table tr th:last-child {\n" +
        "  width: 100px;\n" +
        "  }\n" +
        "  table.table-striped tbody tr:nth-of-type(odd) {\n" +
        "  background-color: #fcfcfc;\n" +
        "  }\n" +
        "  table.table-striped.table-hover tbody tr:hover {\n" +
        "  background: #f5f5f5;\n" +
        "  }\n" +
        "  table.table th i {\n" +
        "    font-size: 13px;\n" +
        "    margin: 0 5px;\n" +
        "    cursor: pointer;\n" +
        "  }\n" +
        "  table.table td:last-child i {\n" +
        "  opacity: 0.9;\n" +
        "  font-size: 22px;\n" +
        "    margin: 0 5px;\n" +
        "  }\n" +
        "  table.table td a {\n" +
        "  font-weight: bold;\n" +
        "  color: #379EC1;\n" +
        "  display: inline-block;\n" +
        "  text-decoration: none;\n" +
        "  outline: none !important;\n" +
        "  }\n" +
        "  table.table td a:hover {\n" +
        "  color: #379EC1;\n" +
        "  }\n" +
        "  table.table td a.edit {\n" +
        "    color: #659224;\n" +
        "  }\n" +
        "  table.table td a.delete {\n" +
        "    color: #659224;\n" +
        "  }\n" +
        "  table.table td i {\n" +
        "    font-size: 19px;\n" +
        "  }" +
        ".completeName {\n" +
        "text-align: left;\n" +
        "position: absolute;\n" +
        "top: 0;\n" +
        "background: white;\n" +
        "padding: 0.5em;\n" +
        "border-radius: 5%;\n" +
        "}\n" +
        "\n" +
        "h1 {\n" +
        "  color: maroon;\n" +
        "  margin-left: 40px;\n" +
        "}\n" +
        "</style><h1>Affectation Mission</h1>");

bw.write("<div cols=75 rows=10>");
String completeName = "John";
bw.write("<h2 class=completeName >" + completeName + "</h2>");
bw.write("<h1> Mission :</h1>");
String mission = "Abattre arbres";
bw.write("<h2>" + mission + "</h2>");
bw.write("<h1> Matériel requis à la mission : <br> Scie </h1>");
bw.write("</div>");
bw.write("</body></html>");
bw.close();
Desktop.getDesktop().browse(f.toURI());
}
}

