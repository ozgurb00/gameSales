package gameSales.abstracts;

import gameSales.entities.Campaign;

public interface CampaignService {
	void add(Campaign campaign);
	void remove(Campaign campaign);
	void update(Campaign campaign);
}
