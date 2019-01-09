/***************************************************************************************************
* ���ϸ� : CO_COCD_2000WB
* ��� : 
 * �ۼ����� : 
 * �ۼ��� : 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.co.cocd.wb;

import java.rmi.RemoteException;
import java.sql.SQLException;

//import javax.ejb.CreateException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.lib.JNDIManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.co.cocd.dao.CO_COCD_2000DAO;
import chosun.ciis.co.cocd.dm.CO_COCD_2000_MDM;
import chosun.ciis.co.cocd.ds.CO_COCD_2000_MDataSet;
import chosun.ciis.co.cocd.dm.CO_COCD_2010_SDM;
import chosun.ciis.co.cocd.ds.CO_COCD_2010_SDataSet;
import chosun.ciis.co.cocd.dm.CO_COCD_2020_SDM;
import chosun.ciis.co.cocd.ds.CO_COCD_2020_SDataSet;
import chosun.ciis.co.cocd.dm.CO_COCD_2030_SDM;
import chosun.ciis.co.cocd.ds.CO_COCD_2030_SDataSet;
/**
 * 
 */

	public class CO_COCD_2000WB extends BaseWB {

		public String convert(String str){
			
			StringBuffer sb = new StringBuffer();
			
			if("".equals(StringUtil.nvl(str)))	return "";
			
			String[] temp = StringUtil.toArray(str, ",");
			
			for(int i=0; i<temp.length; i++){
				
				sb.append("'").append(temp[i]).append("'");
				if(i<temp.length - 1){
					sb.append(",");
				}
			}
			
			return sb.toString();
		}
		
		
		 /**
	     * 
	     *
	     * @param req HttpServletRequest
	     * @param pub HttpServletResponse
	     * @throws AppException
	     */
	    public void CO_COCD_2000_M(HttpServletRequest req, HttpServletResponse pub) throws AppException, SQLException {
	    	CO_COCD_2000_MDataSet ds = null;

	        // DM Setting
	    	CO_COCD_2000_MDM dm = new CO_COCD_2000_MDM();

	       
	        try 
	        {
	        	CO_COCD_2000DAO	dao = new CO_COCD_2000DAO();
	            ds = dao.co_cocd_2000_m(dm);
	            req.setAttribute("ds", ds);  
	        }
	        catch (AppException e)
	        {
	            throw e;
	        } 
	    } 
	    public void CO_COCD_2010_S(HttpServletRequest req, HttpServletResponse pub) throws AppException, SQLException {
	    	 
	    	  
	    	 
	          String addr3 = Util.Uni2Ksc(Util.checkString(req.getParameter("addr3")));	//���鵿
	          String pageno = Util.checkString(req.getParameter("pageno"));				//���� ������
	          String pagesize = Util.checkString(req.getParameter("pagesize"));			//������������

	          CO_COCD_2010_SDM dm = new CO_COCD_2010_SDM();
	          dm.setAddr3(addr3);
	          dm.setPageno(Long.parseLong(pageno));
	          dm.setPagesize(Long.parseLong(pagesize));

	          DBManager manager = new DBManager("MISCOM");
	          CO_COCD_2010_SDataSet ds = (CO_COCD_2010_SDataSet)manager.executeCall(dm);
	          if(!"".equals(ds.errcode)){
	              throw new AppException(ds.errcode, ds.errmsg);
	          }        
	          req.setAttribute("ds", ds);
	       
	    } 
	    public void CO_COCD_2020_S(HttpServletRequest req, HttpServletResponse pub) throws AppException, SQLException { 

	          
	    	  String addr11 = Util.checkString(req.getParameter("addr11"));
	    	  String addr22 = Util.checkString(req.getParameter("addr22"));
	    	  String addr33 = Util.checkString(req.getParameter("addr33"));	
	    	  String largedlvnm = Util.checkString(req.getParameter("largedlvnm"));	//�ǹ���
	          String pageno = Util.checkString(req.getParameter("pageno"));				//���� ������
	          String pagesize = Util.checkString(req.getParameter("pagesize"));			//������������

	          CO_COCD_2020_SDM dm = new CO_COCD_2020_SDM();
	          dm.setAddr11(addr11);
	          dm.setAddr22(addr22);
	          dm.setAddr33(addr33);
	          dm.setLargedlvnm(largedlvnm);
	          dm.setPageno(pageno);
	          dm.setPagesize(pagesize);
	          //dm.setPageno(Long.parseLong(pageno));
	         // dm.setPagesize(Long.parseLong(pagesize));

	          DBManager manager = new DBManager("MISCOM");
	          CO_COCD_2020_SDataSet ds = (CO_COCD_2020_SDataSet)manager.executeCall(dm);
	          if(!"".equals(ds.errcode)){
	              throw new AppException(ds.errcode, ds.errmsg);
	          }        
	          req.setAttribute("ds", ds);
	       
	    }
	    public void CO_COCD_2030_S(HttpServletRequest req, HttpServletResponse pub) throws AppException, SQLException {
	          
	    	  String addr1 = Util.checkString(req.getParameter("addr1"));
	    	  String addr2 = Util.checkString(req.getParameter("addr2"));
	    	  String rdnm = Util.checkString(req.getParameter("rdnm"));	//�ǹ���
	    	  String bldnn1 = Util.checkString(req.getParameter("bldnn1"));	//�ǹ���
	    	  String bldnn2 = Util.checkString(req.getParameter("bldnn2"));	//�ǹ���
	          String pageno = Util.checkString(req.getParameter("pageno"));				//���� ������
	          String pagesize = Util.checkString(req.getParameter("pagesize"));			//������������

	          CO_COCD_2030_SDM dm = new CO_COCD_2030_SDM();
	          dm.setAddr1(addr1);
	          dm.setAddr2(addr2);      
	          dm.setRdnm(rdnm);
	          dm.setBldnn1(bldnn1);
	          dm.setBldnn2(bldnn2);
	          dm.setPageno(pageno);
	          dm.setPagesize(pagesize);
	          //dm.setPageno(Long.parseLong(pageno));
	         // dm.setPagesize(Long.parseLong(pagesize));

	          DBManager manager = new DBManager("MISCOM");
	          CO_COCD_2030_SDataSet ds = (CO_COCD_2030_SDataSet)manager.executeCall(dm);
	          if(!"".equals(ds.errcode)){
	              throw new AppException(ds.errcode, ds.errmsg);
	          }        
	          req.setAttribute("ds", ds);
	       
	    } 
}
