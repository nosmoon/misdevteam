


function isDataRegion(datagrid){
	if(!datagrid.isCell(event.target))  	return false;
	
	if(datagrid.row < datagrid.fixedRows) 	return false;
	
	return true;
}


/**	광고입금전표입력 화면 MDI으로 오픈 **/
function windowLoadPageRcpm(rcpm_slip_no){
	var  occr_dt    = rcpm_slip_no.substr(0,8);
	var  slip_clsf  = rcpm_slip_no.substr(8,2);
	var  seq        = rcpm_slip_no.substr(10);
						
	if( occr_dt == "" && slip_clsf == "" && seq == ""){
		return;	
	}	
	
	if(slip_clsf != "17" && slip_clsf != "27") return;
	
	model.property(KEY_OCCR_DT)    = occr_dt;
	model.property(KEY_SLIP_CLSF)  = slip_clsf;
	model.property(KEY_SEQ) 	   = seq;	
    
    viewer("mainFrame").window.javaScript.onLoadPage2("IS_DEP_1000");
    
}
			