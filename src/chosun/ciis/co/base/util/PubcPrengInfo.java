package chosun.ciis.co.base.util;

import java.util.ArrayList;

import javax.ejb.EJBException;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.ad.common.dao.AdCommonDAO;
import chosun.ciis.ad.common.dm.AD_CO_9010_SDM;
import chosun.ciis.ad.common.ds.AD_CO_9010_SDataSet;

public class PubcPrengInfo {

	private static ArrayList dlcoList;
	private	static PubcPrengInfo instance;

	public static PubcPrengInfo instance(){
		if(instance == null){
			instance = new PubcPrengInfo();
		}
		return instance;
	}
	private ArrayList getDlcoList(){
		if(dlcoList == null){
			dlcoList = new ArrayList();
		}
		return dlcoList;
	}
	
	public AD_CO_9010_SDataSet getDlcoInfo(AD_CO_9010_SDM dm) throws AppException{
		
		AD_CO_9010_SDataSet ds = null;
		String	keyword	= "";
		if(!"".equals(dm.dlco_no)){
			keyword	=	dm.dlco_no;
			for(int i=0; i<getDlcoList().size(); i++){
				AD_CO_9010_SDataSet list_ds = (AD_CO_9010_SDataSet)getDlcoList().get(i);
				if(keyword.equals(list_ds.dlco_no)){
					return list_ds;
				}
			}
		}else if(!"".equals(dm.dlco_nm)){
			keyword	=	dm.dlco_nm;
			for(int i=0; i<getDlcoList().size(); i++){
				AD_CO_9010_SDataSet list_ds = (AD_CO_9010_SDataSet)getDlcoList().get(i);
				if(keyword.equals(list_ds.dlco_nm)){
					return list_ds;
				}
			}
		}else if(!"".equals(dm.slcrg_pers)){
			keyword	=	dm.slcrg_pers;
			for(int i=0; i<getDlcoList().size(); i++){
				AD_CO_9010_SDataSet list_ds = (AD_CO_9010_SDataSet)getDlcoList().get(i);
				if(keyword.equals(list_ds.slcrg_pers)){
					return list_ds;
				}
			}
		}else if(!"".equals(dm.slcrg_pers_nm)){
			keyword	=	dm.slcrg_pers_nm;
			for(int i=0; i<getDlcoList().size(); i++){
				AD_CO_9010_SDataSet list_ds = (AD_CO_9010_SDataSet)getDlcoList().get(i);
				if(keyword.equals(list_ds.slcrg_pers_nm)){
					return list_ds;
				}
			}
		}else if(!"".equals(dm.mchrg_pers)){
			keyword	=	dm.mchrg_pers;
			for(int i=0; i<getDlcoList().size(); i++){
				AD_CO_9010_SDataSet list_ds = (AD_CO_9010_SDataSet)getDlcoList().get(i);
				if(keyword.equals(list_ds.mchrg_pers)){
					return list_ds;
				}
			}
		}else if(!"".equals(dm.mchrg_pers_nm)){
			keyword	=	dm.mchrg_pers_nm;
			for(int i=0; i<getDlcoList().size(); i++){
				AD_CO_9010_SDataSet list_ds = (AD_CO_9010_SDataSet)getDlcoList().get(i);
				if(keyword.equals(list_ds.mchrg_pers_nm)){
					return list_ds;
				}
			}
		}
		
		if(ds == null){
	        try {
				AdCommonDAO dao = new AdCommonDAO();
	            ds = dao.ad_co_9010_s(dm);
	            if((!"".equals(dm.dlco_no) 			&& !"".equals(ds.dlco_nm))			||
                   (!"".equals(dm.dlco_nm) 			&& !"".equals(ds.dlco_no))			||
                   (!"".equals(dm.slcrg_pers) 		&& !"".equals(ds.slcrg_pers_nm))	||	
                   (!"".equals(dm.slcrg_pers_nm) 	&& !"".equals(ds.slcrg_pers))		||	
                   (!"".equals(dm.mchrg_pers) 		&& !"".equals(ds.mchrg_pers_nm))	||	
                   (!"".equals(dm.mchrg_pers_nm) 	&& !"".equals(ds.mchrg_pers)))
	            {
		            getDlcoList().add(ds);
		            //System.out.println("new.......... " + keyword);
	            }
	        }
	        catch (SysException e) {
	            throw new EJBException();
	        }
		}
		return ds;
	}
	
	public void setSlcrgPersInfo(String dlco_no, String slcrg_pers, String slcrg_pers_nm){
		
		for(int i=0; i<getDlcoList().size(); i++){
			AD_CO_9010_SDataSet list_ds = (AD_CO_9010_SDataSet)getDlcoList().get(i);
			if(dlco_no.equals(list_ds.dlco_no)){
				list_ds.slcrg_pers		=	slcrg_pers;
				list_ds.slcrg_pers_nm 	= 	slcrg_pers_nm;
				break;
			}
		}
	}
	
	public void setMchrgPersInfo(String dlco_no, String mchrg_pers, String mchrg_pers_nm){
		
		for(int i=0; i<getDlcoList().size(); i++){
			AD_CO_9010_SDataSet list_ds = (AD_CO_9010_SDataSet)getDlcoList().get(i);
			if(dlco_no.equals(list_ds.dlco_no)){
				list_ds.mchrg_pers		=	mchrg_pers;
				list_ds.mchrg_pers_nm 	= 	mchrg_pers_nm;
				break;
			}
		}
	}
	
}
