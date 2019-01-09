package chosun.ciis.hd.tmpl.wb;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.util.Util;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.hd.tmpl.dm.HD_TMPL_1000_ADM;
import chosun.ciis.hd.tmpl.dm.HD_TMPL_1001_LDM;
import chosun.ciis.hd.tmpl.ds.HD_TMPL_1000_ADataSet;
import chosun.ciis.hd.tmpl.ds.HD_TMPL_1001_LDataSet;

import com.oreilly.servlet.multipart.FilePart;
import com.oreilly.servlet.multipart.MultipartParser;
import com.oreilly.servlet.multipart.ParamPart;
import com.oreilly.servlet.multipart.Part;

public class HD_TMPL_1000WB extends BaseWB{
	public int filesize = 5*1024*1024;

	public void hd_trip_1000_l(HttpServletRequest req, HttpServletResponse res) throws AppException{
		
		DBManager manager = new DBManager("MISHDL");
		
		PrintWriter out = null;
		Hashtable ht = new Hashtable();
		byte[] filecont = null;
		
		try {
			out = res.getWriter();
			MultipartParser multi = new MultipartParser(req, filesize, true, true);
			Part part = null;
			FilePart filePart = null;
			ParamPart parampart = null;
			
			for (int i=0; (part = multi.readNextPart()) != null;i++ ) {

                if (part.isFile()) {
                    filePart = (FilePart) part;
                    // 파일을 첨부했을 경우
                    if(filePart.getFileName() != null){
	                    ht.put(part.getName(), filePart.getFileName());
	                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
	                    filePart.writeTo(byteArrayOutputStream);
	                    filecont = byteArrayOutputStream.toByteArray();
                    	break;
                    }
                    // 파일을 첨부하지 않았을 경우
                    else{
                    	ht.put(part.getName(), "");
                    }
                }
                else if(part.isParam()){
                    parampart = (ParamPart)part;
                    ht.put(part.getName(), parampart.getStringValue());
                }
            }
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		HD_TMPL_1000_ADataSet ds = null;
		HD_TMPL_1000_ADM dm = new HD_TMPL_1000_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.excel_gbn = Util.checkString((String) ht.get("excel_gbn"));
		dm.filenm = Util.checkString((String) ht.get("filenm"));
		dm.filecont = filecont;

		dm.print();

		ds = (HD_TMPL_1000_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_tmpl_1001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		
		DBManager manager = new DBManager("MISHDL");
		
		HD_TMPL_1001_LDataSet ds = null;
		HD_TMPL_1001_LDM dm = new HD_TMPL_1001_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.excel_gbn = Util.checkString(req.getParameter("excel_gbn"));

		dm.print();

		ds = (HD_TMPL_1001_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}

}
