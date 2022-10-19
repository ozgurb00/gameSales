package gameSales.concretes;

import gameSales.abstracts.CampaignService;
import gameSales.entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya eklendi : " + campaign.getName());
		
	}

	@Override
	public void remove(Campaign campaign) {
		System.out.println("Kampanya silindi : " + campaign.getName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya güncellendi : " + campaign.getName());
		
	}

}
