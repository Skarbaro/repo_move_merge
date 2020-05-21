class Datastore:

    WEI_ETH_FACTOR = 1000000000000000000.0

    def __init__(self):
        self.actions = list()

    @classmethod
    def config(cls, es_url, es_maxsize):
        raise NotImplementedError

    def extract(self, rpc_block):
        raise NotImplementedError

    def save(self):
        raise NotImplementedError

	def add_base_fields(self):
    """
      Adds some base fields to a comment object
    """
    _id = self.get_id()
    self.comment.update({
      "_id": _id,
    })