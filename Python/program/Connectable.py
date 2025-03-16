from abc import ABC, abstractmethod

class Connectable(ABC):
    @abstractmethod
    def getConnectionType(self):
        pass
